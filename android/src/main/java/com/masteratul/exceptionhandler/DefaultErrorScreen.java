<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fillViewport="true"
    android:background="#D9EAE1"
    android:orientation="vertical"
    android:visibility="visible">
    <LinearLayout
        android:padding="20dp"
        android:layout_width="match_parent"
        android:orientation="vertical"
        android:layout_height="wrap_content">
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:textSize="24sp"
            android:gravity="center"
            android:textStyle="bold"
            android:textColor="#1F292C"
            android:padding="16dp"
            android:text="A system error has occurred"/>
        <ImageView
            android:tint="#EA3455"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:adjustViewBounds="true"
            android:maxWidth="80dp"
            android:maxHeight="80dp"
            android:scaleType="fitCenter"
            android:src="@drawable/alert"/>

        <TextView
            android:id="@+id/textView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:textColor="#1F292C"
            android:paddingHorizontal="10dp"
            android:paddingTop="16dp"
            android:textSize="16sp"
            android:text="The Loopeli app may no longer function as expected." />
        <TextView
            android:id="@+id/textView2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:textColor="#1F292C"
            android:paddingHorizontal="10dp"
            android:paddingTop="5dp"
            android:textSize="16sp"
            android:text="Please restart the app to continue." />
        <LinearLayout
            android:layout_width="match_parent"
            android:gravity="bottom"
            android:paddingTop="10dp"
            android:layout_height="wrap_content">
            <Button
                android:id="@+id/eh_restart_button"
                android:layout_weight="1"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:backgroundTint="#385858"
                android:textColor="#ffffff"
                android:paddingVertical="24dp"
                android:textSize="16sp"
                android:text="RESTART"/>
            <Button
                android:id="@+id/eh_quit_button"
                android:layout_weight="1"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:backgroundTint="#385858"
                android:textColor="#ffffff"
                android:paddingVertical="24dp"
                android:textSize="16sp"
                android:text="QUIT"/>
        </LinearLayout>
        <Button
            android:id="@+id/eh_show_details_button"
            android:layout_width="match_parent"
            android:layout_height="40dp"
            android:text="SHOW DETAILS"
            android:textSize="18sp"
            android:background="@android:color/transparent"
            android:textStyle="bold"
            android:textColor="#1F292C"
            android:layout_marginTop="4dp"
            android:layout_marginBottom="12dp"
            android:gravity="center"/>
        <TextView
            android:id="@+id/eh_stack_trace_text_view"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="#eeeeee"
            android:padding="16dp"
            android:textColor="#000000"
            android:text=""
            android:visibility="gone"/>

    </LinearLayout>


</ScrollView>
