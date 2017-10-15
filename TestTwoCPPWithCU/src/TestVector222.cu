#include <thrust/device_vector.h>
#include <thrust/copy.h>
#include <vector>
#include <list>
#include <stdio.h>
#include "hello.cuh"

#include <thrust/host_vector.h>
#include <thrust/copy.h>
#include <thrust/fill.h>
#include <thrust/sequence.h>
using namespace std;


class Particle
{
public:
    int particle_id;
    float particle_velocity;
    float particle_density;
};

__global__ void kernel_function(Particle *pointer, int total)
{
    int index=blockIdx.x;

    if(index < total)
    {
        pointer[index].particle_id=pointer[index].particle_id+2;
        pointer[index].particle_velocity=pointer[index].particle_velocity*2;
        pointer[index].particle_density=pointer[index].particle_density*3;
    }
}

int mainForClass()
{
	cout<<endl<<"Main FOR CLASS  AAAAAAAAA      "<<endl;
    std::list<Particle> particle_list;

    Particle particle_a;
    Particle particle_b;
    Particle particle_c;

    particle_a.particle_id=1;
    particle_a.particle_velocity=1.1;
    particle_a.particle_density=1.22;

    particle_b.particle_id=2;
    particle_b.particle_velocity=2.1;
    particle_b.particle_density=2.22;

    particle_c.particle_id=3;
    particle_c.particle_velocity=3.1;
    particle_c.particle_density=3.22;

    particle_list.push_back(particle_a);
    particle_list.push_back(particle_b);
    particle_list.push_back(particle_c);

    thrust::device_vector<Particle> device_list(particle_list.begin(), particle_list.end());

    Particle *raw_pointer;
    raw_pointer=thrust::raw_pointer_cast(&device_list[0]);

    kernel_function<<<3, 1>>>(raw_pointer, device_list.size());

    thrust::host_vector<Particle> host_list=device_list;

    for(int count=0; count<host_list.size(); count++)
    {
        printf("%d, %f, %f\n", host_list[count].particle_id, host_list[count].particle_velocity, host_list[count].particle_density);
    }

    return 0;
}



int mainForFFFF()
{

	cout<<endl<<"FFFFFFFFFFFFFUCK    "<<endl;
	// initialize all ten integers of a device_vector to 1
	thrust :: device_vector <int > D(10 , 1);

	// set the first seven elements of a vector to 9
	thrust :: fill (D. begin () , D. begin () + 7, 9);

	// initialize a host_vector with the first five elements of D
	thrust :: host_vector <int > H(D. begin () , D. begin () + 5);

	// set the elements of H to 0, 1, 2, 3, ...
	thrust :: sequence (H. begin () , H. end ());

	// copy all of H back to the beginning of D
	thrust :: copy (H. begin () , H. end () , D. begin ());
	// print D
	for ( int i = 0; i < D. size (); i ++)
		std::cout << "D[" << i << "] = " << D[i] <<"  ";
	cout<<endl;
	return 0;
}
