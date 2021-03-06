<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#A7FFDB">

<RelativeLayout
        android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="#A7FFDB"
                tools:context=".MainActivity">

<TextView
            android:id="@+id/scoreTitle"
                    android:layout_width="150dp"
                    android:layout_height="wrap_content"
                    android:layout_alignParentTop="true"
                    android:layout_centerHorizontal="true"
                    android:layout_marginTop="30dp"
                    android:layout_marginBottom="8dp"
                    android:gravity="center_horizontal"
                    android:text="@string/score"
                    android:textAllCaps="true"
                    android:textColor="#012E09"
                    android:textSize="16sp"
                    android:textStyle="bold" />

<LinearLayout
            android:id="@+id/layoutOne"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/scoreTitle"
                    android:layout_centerHorizontal="true"
                    android:layout_margin="0dp"
                    android:background="#A7FFDB"
                    android:orientation="horizontal">

<LinearLayout
                android:layout_width="116dp"
                        android:layout_height="wrap_content"
                        android:layout_marginLeft="20dp"
                        android:layout_marginTop="20dp"
                        android:layout_marginRight="20dp"
                        android:layout_marginBottom="0dp"
                        android:layout_weight="1"
                        android:orientation="vertical"
                        android:paddingLeft="10dp"
                        android:paddingTop="0dp"
                        android:paddingRight="10dp"
                        android:paddingBottom="0dp">

<TextView
                    android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_gravity="center_horizontal"
                            android:layout_marginBottom="20dp"
                            android:text="@string/team_a_score"
                            android:textColor="@android:color/black"
                            android:textSize="14sp"
                            android:textStyle="bold" />

<TextView
                    android:id="@+id/score_team_a"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_gravity="center_horizontal"
                            android:text="@string/_0"
                            android:textColor="@android:color/black"
                            android:textSize="40sp"
                            app:fontFamily="sans-serif-condensed-light" />

<Button
                    android:id="@+id/btn_score_team_a"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_gravity="center_horizontal"
                            android:layout_marginTop="10dp"
                            android:onClick="scoreTeamA"
                            android:padding="5dp"
                            android:text="@string/add"
                            android:textAllCaps="false"
                            android:textColor="@android:color/black"
                            android:textSize="14sp" />

</LinearLayout>

<View
                android:layout_width="3dp"
                        android:layout_height="match_parent"
                        android:background="#046132" />

<LinearLayout
                android:id="@+id/layout_score_b"
                        android:layout_width="116dp"
                        android:layout_height="wrap_content"
                        android:layout_marginLeft="20dp"
                        android:layout_marginTop="20dp"
                        android:layout_marginRight="20dp"
                        android:layout_marginBottom="0dp"
                        android:layout_weight="1"
                        android:orientation="vertical"
                        android:paddingLeft="10dp"
                        android:paddingTop="0dp"
                        android:paddingRight="10dp"
                        android:paddingBottom="0dp">

<TextView
                    android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_gravity="center_horizontal"
                            android:layout_marginBottom="20dp"
                            android:text="@string/team_b_score"
                            android:textColor="@android:color/black"
                            android:textSize="14sp"
                            android:textStyle="bold" />

<TextView
                    android:id="@+id/score_team_b"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_gravity="center_horizontal"
                            android:text="@string/_0"
                            android:textColor="@android:color/black"
                            android:textSize="40sp"
                            app:fontFamily="sans-serif-condensed-light" />

<Button
                    android:id="@+id/btn_score_team_b"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_gravity="center_horizontal"
                            android:layout_marginTop="10dp"
                            android:onClick="scoreTeamB"
                            android:padding="5dp"
                            android:text="@string/add"
                            android:textAllCaps="false"
                            android:textColor="@android:color/black"
                            android:textSize="14sp" />

</LinearLayout>

</LinearLayout>

<View
            android:id="@+id/line4"
                    android:layout_width="270dp"
                    android:layout_height="3dp"
                    android:layout_below="@id/layoutOne"
                    android:layout_centerHorizontal="true"
                    android:layout_marginTop="16dp"
                    android:background="#046132" />


<TextView
            android:id="@+id/titleFouls"
                    android:layout_width="150dp"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/line4"
                    android:layout_centerHorizontal="true"
                    android:layout_marginTop="6dp"
                    android:layout_marginBottom="10dp"
                    android:gravity="center_horizontal"
                    android:text="@string/fouls"
                    android:textAllCaps="true"
                    android:textColor="#DF1111"
                    android:textSize="16sp"
                    android:textStyle="bold" />

<LinearLayout
            android:id="@+id/layout_two"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/titleFouls"
                    android:layout_centerHorizontal="true"
                    android:layout_marginStart="0dp"
                    android:layout_marginLeft="0dp"
                    android:layout_marginTop="0dp"
                    android:layout_marginEnd="0dp"
                    android:layout_marginRight="0dp"
                    android:background="#A7FFDB"
                    android:orientation="horizontal">

<LinearLayout
                android:layout_width="116dp"
                        android:layout_height="wrap_content"
                        android:layout_marginLeft="20dp"
                        android:layout_marginTop="20dp"
                        android:layout_marginRight="20dp"
                        android:layout_marginBottom="0dp"
                        android:layout_weight="1"
                        android:orientation="vertical"
                        android:paddingLeft="10dp"
                        android:paddingTop="0dp"
                        android:paddingRight="10dp"
                        android:paddingBottom="0dp">

<TextView
                    android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_gravity="center_horizontal"
                            android:layout_marginBottom="20dp"
                            android:text="@string/team_a_fouls"
                            android:textColor="@android:color/black"
                            android:textSize="14sp"
                            android:textStyle="bold" />

<TextView
                    android:id="@+id/fouls_team_a"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_gravity="center_horizontal"
                            android:text="@string/_0"
                            android:textColor="@android:color/black"
                            android:textSize="40sp"
                            app:fontFamily="sans-serif-condensed-light" />

<Button
                    android:id="@+id/btn_fouls_team_a"
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:layout_gravity="center_horizontal"
                            android:layout_marginTop="10dp"
                            android:onClick="foulsTeamA"
                            android:padding="5dp"
                            android:text="@string/add"
                            android:textAllCaps="false"
                            android:textColor="@android:color/black"
                            android:textSize="14sp" />

</LinearLayout>

<View
                android:layout_width="3dp"
                        android:layout_height="match_parent"
                        android:background="#046132" />

<LinearLayout
                android:layout_width="116dp"
                        android:layout_height="wrap_content"
                        android:layout_marginLeft="20dp"
                        android:layout_marginTop="20dp"
                        android:layout_marginRight="20dp"
                        android:layout_marginBottom="0dp"
                        android:layout_weight="1"
                        android:orientation="vertical"
                        android:paddingLeft="10dp"
                        android:paddingTop="0dp"
                        android:paddingRight="10dp"
                        android:paddingBottom="0dp">

<TextView
                    android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_gravity="center_horizontal"
                            android:layout_marginBottom="20dp"
                            android:text="@string/team_b_fouls"
                            android:textColor="@android:color/black"
                            android:textSize="14sp"
                            android:textStyle="bold" />

<TextView
                    android:id="@+id/fouls_team_b"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_gravity="center_horizontal"
                            android:text="@string/_0"
                            android:textColor="@android:color/black"
                            android:textSize="40sp"
                            app:fontFamily="sans-serif-condensed-light" />

<Button
                    android:id="@+id/btn_fouls_team_b"
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:layout_gravity="center_horizontal"
                            android:layout_marginTop="10dp"
                            android:onClick="foulsTeamB"
                            android:padding="5dp"
                            android:text="@string/add"
                            android:textAllCaps="false"
                            android:textColor="@android:color/black"
                            android:textSize="14sp" />


</LinearLayout>
</LinearLayout>

<Button
            android:id="@+id/btn_resetAll"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/layout_two"
                    android:layout_centerHorizontal="true"
                    android:layout_marginTop="30dp"
                    android:layout_marginBottom="32dp"
                    android:onClick="resetButtonAll"
                    android:text="@string/reset"
                    android:textSize="14sp" />


</RelativeLayout>

</ScrollView>