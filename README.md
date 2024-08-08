# Ride Booking Application 

This is a high-level design diagram for a ride booking application similar to Uber. The application allows users to book rides, and drivers to accept and complete rides. The system supports various operations including authentication, ride management, payment, and notification services.

![Ride Booking Application Diagram](C:\Users\napal\Desktop\TEMPLE_TWIST\RapiRide\src\main\resources\images\img.png)

## Table of Contents

- [Overview](#overview)
- [Services](#services)
    - [UserService](#userservice)
    - [DriverService](#driverservice)
    - [RiderService](#riderservice)
    - [RideRequestService](#riderequestservice)
    - [Payment](#payment)
    - [Email Notification](#email-notification)
- [Entities](#entities)
    - [User](#user)
    - [Admin](#admin)
    - [Driver](#driver)
    - [Rider](#rider)
    - [Ride](#ride)
    - [Wallet](#wallet)
    - [Rating](#rating)
- [Patterns](#patterns)
    - [StrategyDesignPattern](#strategydesignpattern)
    - [BuilderPattern](#builderpattern)
    - [FactoryPattern](#factorypattern)
    - [SingletonPattern](#singletonpattern)
- [Operations](#operations)
    - [User Operations](#user-operations)
    - [Admin Operations](#admin-operations)
    - [Rider Operations](#rider-operations)
    - [Driver Operations](#driver-operations)
    - [System Operations](#system-operations)
- [Development and Testing](#development-and-testing)
    - [Swagger UI Documentation](#swagger-ui-documentation)
    - [Profiles](#profiles)
    - [Testing](#testing)

## Overview

The ride booking application consists of several services and entities to manage the lifecycle of a ride request, from user authentication to ride completion and payment processing. The diagram illustrates the interactions between these components.

## Services

### UserService

Handles user authentication operations including signup, login, and logout.

### DriverService

Manages driver-related operations such as starting, canceling, and ending rides.

### RiderService

Responsible for rider-related operations including requesting and canceling rides.

### RideRequestService

Coordinates the process of matching drivers to ride requests using different strategies.

### Payment

Handles payment processing for completed rides.

### Email Notification

Sends email notifications to drivers about ride requests.

## Entities

### User

Represents the end-users of the application, including riders and drivers.

### Admin

Handles administrative tasks such as onboarding drivers and fetching all rides.

### Driver

Represents the drivers who accept ride requests and provide transportation services.

### Rider

Represents the riders who request rides and use the transportation services.

### Ride

Represents the ride details including status and associated operations.

### Wallet

Handles the financial transactions related to rides and user accounts.

### Rating

Manages the rating system for drivers and riders.

## Patterns

### StrategyDesignPattern

Used for implementing different driver matching and fare calculation strategies.

### BuilderPattern

Used for constructing complex objects in a step-by-step manner.

### FactoryPattern

Used for creating objects without specifying the exact class of the object that will be created.

### SingletonPattern

Ensures a class has only one instance and provides a global point of access to it.

## Operations

### User Operations

- `signUp`
- `logIn`
- `logOut`

### Admin Operations

- `onboardDriver`
- `getAllRides`

### Rider Operations

- `getAllRides`
- `requestRide`
- `cancelRide`
- `rateDriver`
- `addFunds`

### Driver Operations

- `getAllRides`
- `acceptRide`
- `startRide`
- `cancelRide`
- `endRide`
- `rateRider`
- `debitFunds`

### System Operations

- `updateLocation`

## Development and Testing

### Swagger UI Documentation

Provides interactive API documentation for testing and development purposes.

### Profiles

Supports different profiles such as DEV and PROD for different environments.

### Testing

Includes unit and integration tests to ensure the application functions as expected.

