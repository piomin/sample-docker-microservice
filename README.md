# Spring Boot vs Quarkus Microservices Comparison [![Twitter](https://img.shields.io/twitter/follow/piotr_minkowski.svg?style=social&logo=twitter&label=Follow%20Me)](https://twitter.com/piotr_minkowski)

[![CircleCI](https://circleci.com/gh/piomin/sample-docker-microservice.svg?style=svg)](https://circleci.com/gh/piomin/sample-docker-microservice)
[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-black.svg)](https://sonarcloud.io/dashboard?id=piomin_sample-docker-microservice)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=piomin_sample-docker-microservice&metric=bugs)](https://sonarcloud.io/dashboard?id=piomin_sample-docker-microservice)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=piomin_sample-docker-microservice&metric=coverage)](https://sonarcloud.io/dashboard?id=piomin_sample-docker-microservice)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=piomin_sample-docker-microservice&metric=ncloc)](https://sonarcloud.io/dashboard?id=piomin_sample-docker-microservice)

A comprehensive comparison project demonstrating identical microservices built with **Spring Boot** and **Quarkus**, showcasing performance differences in startup time, memory consumption, Docker image size, and native compilation capabilities.

## Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Technologies Comparison](#technologies-comparison)
- [Prerequisites](#prerequisites)
- [Quick Start](#quick-start)
- [API Documentation](#api-documentation)
- [Docker Deployment](#docker-deployment)
- [Performance Comparison](#performance-comparison)
- [Development](#development)
- [Testing](#testing)
- [CI/CD](#cicd)
- [Contributing](#contributing)
- [Resources](#resources)
- [Author](#author)

## Overview

This project provides a side-by-side comparison of two popular Java frameworks for building cloud-native microservices:

- **Spring Boot**: The traditional, mature framework with extensive ecosystem
- **Quarkus**: The modern, cloud-native framework optimized for containerized environments

Both microservices implement identical functionality - a Person management REST API with the same endpoints, data model, and business logic - enabling direct performance and resource usage comparison.

### Key Comparison Metrics

- **🚀 Startup Time**: Application initialization speed
- **💾 Memory Usage**: Runtime memory consumption
- **📦 Container Size**: Docker image size comparison
- **⚡ Native Compilation**: GraalVM native image support
- **🔧 Developer Experience**: Hot reload, debugging, and development workflow
- **🧪 Testing**: Framework-specific testing approaches

## Project Structure


git add .