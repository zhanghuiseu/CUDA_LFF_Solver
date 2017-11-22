################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CU_SRCS += \
../src/cuda/CLF.cu \
../src/cuda/ExcuteConstraint.cu \
../src/cuda/ParallelATG.cu 

CU_DEPS += \
./src/cuda/CLF.d \
./src/cuda/ExcuteConstraint.d \
./src/cuda/ParallelATG.d 

OBJS += \
./src/cuda/CLF.o \
./src/cuda/ExcuteConstraint.o \
./src/cuda/ParallelATG.o 


# Each subdirectory must supply rules for building sources it contributes
src/cuda/%.o: ../src/cuda/%.cu
	@echo 'Building file: $<'
	@echo 'Invoking: NVCC Compiler'
	/usr/local/cuda-8.0/bin/nvcc -G -g -O0 -gencode arch=compute_50,code=sm_50  -odir "src/cuda" -M -o "$(@:%.o=%.d)" "$<"
	/usr/local/cuda-8.0/bin/nvcc -G -g -O0 --compile --relocatable-device-code=true -gencode arch=compute_50,code=compute_50 -gencode arch=compute_50,code=sm_50  -x cu -o  "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


