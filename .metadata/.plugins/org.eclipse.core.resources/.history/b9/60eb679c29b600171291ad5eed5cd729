################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/solver/ATG.cpp \
../src/solver/PCATG.cpp \
../src/solver/runLFFSolver.cpp 

OBJS += \
./src/solver/ATG.o \
./src/solver/PCATG.o \
./src/solver/runLFFSolver.o 

CPP_DEPS += \
./src/solver/ATG.d \
./src/solver/PCATG.d \
./src/solver/runLFFSolver.d 


# Each subdirectory must supply rules for building sources it contributes
src/solver/%.o: ../src/solver/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: NVCC Compiler'
	/usr/local/cuda-8.0/bin/nvcc -G -g -O0 -gencode arch=compute_50,code=sm_50  -odir "src/solver" -M -o "$(@:%.o=%.d)" "$<"
	/usr/local/cuda-8.0/bin/nvcc -G -g -O0 --compile  -x c++ -o  "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


