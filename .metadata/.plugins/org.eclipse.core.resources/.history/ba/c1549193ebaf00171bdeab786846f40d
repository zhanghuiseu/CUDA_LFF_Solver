################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CU_SRCS += \
../stream/cudaStream.cu \
../stream/testStream.cu 

CU_DEPS += \
./stream/cudaStream.d \
./stream/testStream.d 

OBJS += \
./stream/cudaStream.o \
./stream/testStream.o 


# Each subdirectory must supply rules for building sources it contributes
stream/%.o: ../stream/%.cu
	@echo 'Building file: $<'
	@echo 'Invoking: NVCC Compiler'
	/usr/local/cuda-8.0/bin/nvcc -G -g -O0 -gencode arch=compute_50,code=sm_50  -odir "stream" -M -o "$(@:%.o=%.d)" "$<"
	/usr/local/cuda-8.0/bin/nvcc -G -g -O0 --compile --relocatable-device-code=true -gencode arch=compute_50,code=compute_50 -gencode arch=compute_50,code=sm_50  -x cu -o  "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


