package com.kennethkip.movieapp2

import android.annotation.SuppressLint
import android.graphics.Paint.Align
import android.icu.text.CaseMap.Title
import android.icu.text.ListFormatter.Width
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kennethkip.movieapp2.ui.theme.MovieApp2Theme
import java.util.Date

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          val painter = painterResource(id = R.drawable.movie1)
            val description = "Wonder Women (1984)"
            val tit = "Popular Movie"


            val series = listOf(
                R.drawable.movie1,
                R.drawable.movie2,
                R.drawable.movie3,
                R.drawable.movie4,
                R.drawable.movie5,
                R.drawable.movie6,
                R.drawable.movie7,
                R.drawable.movie8,




            )
            val title = listOf(){
                "MOV"

            }

            

            MovieApp2Theme {
                      Scaffold( containerColor = Color.Black,

                          topBar = {

                              TopAppBar(

                                  colors = TopAppBarDefaults.smallTopAppBarColors(
                                      containerColor = MaterialTheme.colorScheme.onSecondaryContainer
                                  )

                                  ,
                                  title = {

                                  Row(
                                      modifier =  Modifier.fillMaxWidth(),

                                  ) {
                                      Text(
                                          fontWeight = FontWeight.ExtraBold,
                                          color = Color.White,

                                          text = "MOV"
                                           )
                                      Text(
                                           color = Color.Red,
                                            fontWeight = FontWeight.ExtraBold,
                                          text = "VE")

                              
                                 
                                  }


                                      
                                  },
                                  actions = {
                                      Icon(
                                          imageVector = Icons.Default.Search, contentDescription = null,
                                        tint = Color.White)
                                  }

                              ) 
                          }
                      ) { PaddingValues->

                          LazyColumn(modifier = Modifier
                              .fillMaxSize()

                              .padding(PaddingValues),
                              verticalArrangement = Arrangement.Top
                              ) {


                               item {
                                   Text(
                                       modifier =  Modifier.padding(20.dp),

                                       text = "Popular Movie",
                                         color = Color.White,
                                       fontSize = 30.sp


                                       )


                                   LazyRow( modifier = Modifier
                                       .fillMaxSize()
                                       .padding(12.dp),


                                   )

                                   {
                                   item { Card(
                                       modifier = Modifier.fillMaxSize()
                                       


                                   ) 
                                    
                                   {
                                      Spacer(modifier = Modifier.width(12.dp))
                                           Image(painter = painterResource(id = R.drawable.movie6), contentDescription = null)

                                           
                                               Column(modifier = Modifier.padding(10.dp)) {
                                                   Text(
                                                       modifier = Modifier.fillMaxSize(), 
                                                       text = "My Movie")

                                                   Text(
                                                       modifier = Modifier.fillMaxSize(),
                                                       text = "Apr 30 2008")


                                               }





                                       

                                   }

                                          Spacer(modifier = Modifier.width(12.dp))

                                       Card() {

                                               Image(painter = painterResource(id = R.drawable.movie2), contentDescription = null)


                                                   Column(modifier = Modifier.padding(10.dp)) {
                                                       Text(text = "Soldier")
                                                       Text(text = "Apr 30 2008")

                                                   }






                                       }

                                       Spacer(modifier = Modifier.width(12.dp))
                                       Card() {
                                          
                                              Box() {

                                                  Image(
                                                      painter = painterResource(id = R.drawable.movie3),
                                                      contentDescription = null
                                                  )
                                              }
                                               
                                                   Column(modifier = Modifier.padding(10.dp)) {
                                                       Text(text = "Bandits")
                                                       Text(text = "Aug 19 2018")
                                                   }




                                               


                                           

                                       }


                                       Spacer(modifier = Modifier.width(12.dp))

                                       Card() {
                                           
                                               Image(painter = painterResource(id = R.drawable.movie7), contentDescription = null)

                                               
                                                   Column(
                                                       modifier = Modifier.padding(10.dp),
                                                   ) {
                                                       Text(

                                                           text = "Jungle")
                                                       Text(text = "Des 19 2020")

                                                   }

                                               


                                           

                                       }





                                   }
                                   }


                               }





                              item {
                                  Text(
                                      modifier =  Modifier.padding(20.dp),
                                      text = "TV Show",
                                      color = Color.White,
                                      fontSize = 30.sp

                                  )


                                  LazyRow( modifier = Modifier
                                      .fillMaxSize()
                                      .padding(12.dp)


                                  ){
                                      item { Card(
                                          modifier = Modifier
                                              .padding(16.dp)
                                              .background(Color.Black),




                                          shape = MaterialTheme.shapes.medium


                                      ) {
                                         
                                              Image(painter = painterResource(id = R.drawable.movie3), contentDescription = null)


                                                  Column(modifier = Modifier.padding(10.dp)
                                                      .background(Color.Black),



                                                      ) {
                                                      Text(
                                                          modifier = Modifier.fillMaxSize(),


                                                          text = "BackLand"
                                                             )
                                                      Text(
                                                          modifier = Modifier.fillMaxSize(),
                                                          text = "Apr 30 2008")
                                                  }




                                         

                                      }

                                          Card(
                                              modifier = Modifier
                                                  .padding(16.dp)
                                                  .background(Color.Black),


                                              shape = MaterialTheme.shapes.medium
                                          ) {

                                              Image(painter = painterResource(id = R.drawable.movie1), contentDescription = null)


                                              Column(modifier = Modifier.padding(10.dp)) {
                                                  Text(text = "Blody")
                                                  Text(text = "Jan 10 2019")

                                              }






                                          }

                                          Spacer(modifier = Modifier.width(12.dp))
                                          Card() {
                                              
                                                  Image(painter = painterResource(id = R.drawable.movie5), contentDescription = null)

                                                  
                                                      Column(modifier = Modifier.padding(10.dp)) {
                                                          Text(text = "Jungle")
                                                          Text(text = "Apr 30 2008")

                                                      }

                                                  


                                              

                                          }
                                          Spacer(modifier = Modifier.width(12.dp))
                                          Card() {
                                              
                                                  Image(painter = painterResource(id = R.drawable.movie1), contentDescription = null)








                                              Column(modifier = Modifier.padding(10.dp)) {
                                                  Text(
                                                      text = "Greetings")
                                                  Text(text = "Dec 30 2013")

                                              }
                                          }







                                      }
                                  }


                              }






                              item {
                                  Text(
                                      modifier =  Modifier.padding(20.dp),
                                      text = "Continue Watching",

                                      color = Color.White,
                                      fontSize = 30.sp

                                  )


                                  LazyRow( modifier = Modifier
                                      .fillMaxSize()
                                      .padding(12.dp)


                                  ){


                                      item {
                                            Spacer(modifier = Modifier.width(12.dp))
                                          Card() {
                                          
                                              Image(painter = painterResource(id = R.drawable.movie3), contentDescription = null)

                                              
                                                  Column(modifier = Modifier.padding(10.dp)) {
                                                      Text(
                                                          modifier = Modifier.fillMaxSize(),
                                                          text = "My Movie")
                                                      Text(
                                                          modifier = Modifier.fillMaxSize(),
                                                          text = "Feb 12 2017")

                                                  }








                                          
                                      }
                                             Spacer(modifier = Modifier.width(12.dp))
                                          Card(

                                              modifier = Modifier.fillMaxSize()

                                          ) {

                                              Image(
                                                   modifier = Modifier.fillMaxSize(Float.MAX_VALUE),



                                                  painter = painterResource(id = R.drawable.movie2), contentDescription = null)


                                             Column(
                                                 modifier = Modifier.padding(10.dp)
                                             ) {
                                                  Text(text = "Wonder Women")
                                                  Text(text = "Des 20, 2020")
                                              }







                                          }
                                          Spacer(modifier = Modifier.width(12.dp))



                                          Card() {
                                              
                                                  Image(painter = painterResource(id = R.drawable.movie5), contentDescription = null)

                                                  
                                                      Column(modifier = Modifier.padding(10.dp)) {
                                                          Text(text = "My Movie")
                                                          Text(text = "Des 16, 2020")

                                                      }

                                                  


                                              }

                                          }}







                                      }
                                  }


                              }




                          }


                          }





                          }

                              }
                       
                  
                  
                     






@Composable
fun ImageCard (
    painter : Painter,
    contentDescription: String,
    tit : String,
    modifier:Modifier = Modifier
){
    Card(modifier = modifier.fillMaxSize(),
    shape = RoundedCornerShape(15.dp),

    ) {
        Box(modifier = Modifier
            .height(200.dp)
            .fillMaxSize()) {
            Image(

                painter = painterResource(id = R.drawable.movie1), contentDescription =contentDescription,
                contentScale = ContentScale.Crop
             )
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(tit , style = TextStyle(color= Color.White, fontSize = 16.sp))

            }

        }

    }
}
