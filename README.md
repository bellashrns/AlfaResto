# AlfaResto

**AlfaResto** is a food‑ordering Android application written in Kotlin.  
It lets users register or sign in, browse menus from a remote Firestore database,  
add items to a cart, place orders, and review past orders.

The app follows a **clean architecture** approach with clear separation between data, domain,  
and presentation layers, and uses modern Android components such as Room, Firebase, Hilt, Paging,  
and Google Maps.

## Features

- **User Authentication**: Register and log in using Firebase Authentication.
- **Menu Browsing**: View restaurant menus loaded via Firestore with paging support.
- **Cart Management**: Add, remove, and update menu items in the shopping cart using Room persistence.
- **Order Placement**: Place orders and store them in Firestore.
- **Order History**: View a list of previous orders with details.
- **Address Management**: Save and manage delivery addresses.
- **Location Integration**: Select delivery location using Google Maps.
- **Clean UI**: Follows Material Design principles.

## Tech Stack

- **Language**: Kotlin
- **Architecture**: MVVM + Clean Architecture
- **Dependency Injection**: Hilt
- **Database**: Room
- **Remote Data**: Firebase Firestore
- **Authentication**: Firebase Auth
- **Paging**: Android Paging 3
- **Maps**: Google Maps API
- **Asynchronous Handling**: Coroutines + Flow

## Project Structure

```
app/
 ├── data/       # Data sources, repository implementations, Room DB, API calls
 ├── domain/     # Entities, repository interfaces, use cases
 ├── ui/         # Activities, Fragments, Adapters, ViewModels
 ├── di/         # Hilt dependency injection modules
 └── utils/      # Utility classes
```

## Getting Started

### Prerequisites
- Android Studio Iguana or newer
- JDK 17+
- Firebase project with Firestore and Authentication enabled
- Google Maps API key

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/bellashrns/AlfaResto.git
   ```
2. Open in Android Studio.
3. Add your `google-services.json` to the `app/` directory.
4. Add your Google Maps API key in `local.properties`:
   ```
   MAPS_API_KEY=your_api_key_here
   ```
5. Sync the project with Gradle.

### Run the App
- Build and run on an emulator or physical Android device.
