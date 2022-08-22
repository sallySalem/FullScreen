# FullScreen
There are different ways to handel the fullscreen (without System bar or behind the System Bar)

- Without System bar
  - [Immsersive mode](https://github.com/sallySalem/FullScreen#immsersive-mode)
- Behind the System Bar
  - [Edge-To-Edge](https://github.com/sallySalem/FullScreen#edge-to-edge)
  - [WindowInsetsListener](https://github.com/sallySalem/FullScreen#windowinsetslistener)
  - [Layout behavior](https://github.com/sallySalem/FullScreen#layout-behavior-using-coordinatorlayout)

## Fullscreen without systembar
### Immsersive mode

To Hide systemBars
``` kotlin
WindowInsetsControllerCompat(window, window.decorView)

windowInsets.hide(WindowInsetsCompat.Type.systemBars())
windowInsets.systemBarsBehavior =
   WindowInsetsControllerCompat.BEHAVIOR_SHOW_BARS_BY_SWIPE
   ```


https://user-images.githubusercontent.com/2602891/185849430-df1bd070-80a0-405a-9a9e-12a56b9cb1b9.mov

<br/>

-----

## Fullscreen behind the System Bar
<img align="right" width="200" height="400" src="https://user-images.githubusercontent.com/2602891/185849677-8715cacc-a376-4484-bfcf-d01fe945d00b.png">

### Edge-To-Edge

Use setDecorFitsSystemWindows (Edge-To-Edge)

```kotlin
WindowCompat
    .setDecorFitsSystemWindows(
        window,
        false
    )

```
 
 <br/> 
 <br/> 
 <br/>
 <br/> 
 <br/>
 <br/> 
 <br/> 
 <br/>

https://user-images.githubusercontent.com/2602891/185849851-892168aa-9c58-490e-b262-89127e527bb7.mov

-----

### WindowInsetsListener

<img align="right" width="200" height="400" src="https://user-images.githubusercontent.com/2602891/185850286-8e67f601-4c0c-4a0f-afbd-ca69a32b410d.png">

Return CONSUMED from WindowInsetsListener

```kotlin
 ViewCompat.setOnApplyWindowInsetsListener(window.decorView) { _, _ ->
     WindowInsetsCompat.CONSUMED 
}

```
To reset

```kotlin 
 ViewCompat.setOnApplyWindowInsetsListener(window.decorView, null)

```

 <br/> 
 <br/> 
 <br/> 
 <br/>
 <br/> 
 <br/> 
 
----

### Layout behavior using CoordinatorLayout

<img align="right" width="200" height="400" src="https://user-images.githubusercontent.com/2602891/185850489-486033e3-b592-4454-b159-7e87a77aae0f.png">

```kotlin
app:layout_behavior="@string/appbar_scrolling_view_behavior"
```

```kotlin 
<?xml version="1.0" encoding="utf-8"?>
<androidx.coordinatorlayout.widget.CoordinatorLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true">

    <!-- Need for scrolling view behaviour -->
    <com.google.android.material.appbar.AppBarLayout
        android:id="@+id/app_bar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/black"
        android:fitsSystemWindows="true"
        android:visibility="gone"/>

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_behavior="@string/appbar_scrolling_view_behavior">

        <!-- Add your layout -->
    </FrameLayout>
</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

Set transperant statusbar

```kotlin 
window.statusBarColor = Color.TRANSPARENT

```
----
----

## Window insets
**Window insets:** is the area you display your screen
> To get insets

```Kotlin
 val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())
```

> To change of the window insets for a view `setOnApplyWindowInsetsListener`


https://user-images.githubusercontent.com/2602891/185851089-14a1a9b2-5600-4c30-b675-46977669d199.mov


---
## The system bars
**The system bars:** the status bar and the navigation bar
> Hide system bar

```kotlin
WindowInsetsControllerCompat(
            window,
            window.decorView
        ).hide(WindowInsetsCompat.Type.systemBars())
```
> Show system bar

```kotlin 
WindowInsetsControllerCompat(
            window,
            window.decorView
        ).show(WindowInsetsCompat.Type.systemBars())
```
> To control the visibility to one of system bars


Replace 
```kotlin 
WindowInsetsCompat.Type.systemBars() 
```
With

```kotlin 
WindowInsetsCompat.Type.navigationBars()
Or 
WindowInsetsCompat.Type.statusBars()
```




