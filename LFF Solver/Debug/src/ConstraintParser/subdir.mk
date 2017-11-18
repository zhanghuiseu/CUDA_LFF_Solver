################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CU_SRCS += \
../src/ConstraintParser/ConstraintParameter.cu 

CU_DEPS += \
./src/ConstraintParser/ConstraintParameter.d 

OBJS += \
./src/ConstraintParser/ConstraintParameter.o 


# Each subdirectory must supply rules for building sources it contributes
src/ConstraintParser/%.o: ../src/ConstraintParser/%.cu
	@echo 'Building file: $<'
	@echo 'Invoking: NVCC Compiler'
	/usr/local/cuda-8.0/bin/nvcc -G -g -O0 -gencode arch=compute_50,code=sm_50  -odir "src/ConstraintParser" -M -o "$(@:%.o=%.d)" "$<"
	/usr/local/cuda-8.0/bin/nvcc -G -g -O0 --compile --relocatable-device-code=true -gencode arch=compute_50,code=compute_50 -gencode arch=compute_50,code=sm_50  -x cu -o  "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


