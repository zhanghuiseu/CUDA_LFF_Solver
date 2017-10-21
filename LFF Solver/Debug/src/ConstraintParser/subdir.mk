################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/ConstraintParser/ConstraintParameter.cpp 

OBJS += \
./src/ConstraintParser/ConstraintParameter.o 

CPP_DEPS += \
./src/ConstraintParser/ConstraintParameter.d 


# Each subdirectory must supply rules for building sources it contributes
src/ConstraintParser/%.o: ../src/ConstraintParser/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: NVCC Compiler'
	/usr/local/cuda-8.0/bin/nvcc -G -g -O0 -gencode arch=compute_50,code=sm_50  -odir "src/ConstraintParser" -M -o "$(@:%.o=%.d)" "$<"
	/usr/local/cuda-8.0/bin/nvcc -G -g -O0 --compile  -x c++ -o  "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


