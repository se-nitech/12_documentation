FROM python:3.12-slim

RUN apt -y update && apt -y install git

# doxygen
RUN apt -y install diffutils patch make doxygen

# pandoc
RUN apt -y install pandoc gcc \
    && pip install rstcheck ipykernel esbonio

# Java
RUN apt -y install openjdk-17-jre openjdk-17-jdk

WORKDIR /mnt
