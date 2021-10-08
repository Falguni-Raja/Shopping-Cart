// Created by Falguni Raja

import java.util.Scanner;

public class easyshopy {
          static int totalCost;
          public static void main(String args[])
          {
              Scanner input=new Scanner(System.in);
              System.out.println("******************************E-SHOPY***********************");
              String s;
              System.out.println("Enter your name");
              s=input.nextLine();
              System.out.println("WELCOME **"+s+"** TO EASYSHOPY, HOPE YOU ENJOY YOUR SHOPPING");
              System.out.println("SELECT YOUR NECESSITIES");
              int choice,cost[],a[],i,c=1;
              cost=new int[27];
              a=new int[27];
              char items[][];
              items=new char[27][100];
              
              
              do {
                  System.out.println("**********MENU***********");
                  System.out.println("1. COMPUTER ACCESSORIES");
                  System.out.println("2. SHOES");
                  System.out.println("3. MOBILES");
                  System.out.println("ENTER YOUR CHOICE");
                  choice=input.nextInt();
                  switch(choice)
                  {
                  
                  //***************************[[ACCESSORIES]]***************************
                  
                  
                    case 1:
                        System.out.println("WE HAVE A GREAT VARIETIES OF ACCESSORIES");
                    {
                      int accessoriesChoice;
                      System.out.println("1. PENDRIVE");
                      System.out.println("2. MOUSE");
                      System.out.println("3. KEYBOARD");
                      System.out.println("SELECT YOUR ACCESSORY");
                      accessoriesChoice=input.nextInt();
                      cost[0]=355; 
                      cost[1]=455;
                      cost[2]=555;// 3 cost for penDrive
                      cost[3]=655;
                      cost[4]=755;
                      cost[5]=855;//3 cost for Mouse
                      cost[6]=155;
                      cost[7]=255;
                      cost[8]=325;//3 cost for keyBoard
                      switch(accessoriesChoice)
                      {
                      
                      // *************PENDRIVE******************
                      case 1:System.out.println("YOU CHOSE PENDRIVE");
                      {
                          int selectCompany;     
                          System.out.println("1. AMAZON  - PENDRIVE IS 355 RS");
                          System.out.println("2. FLIPKART - PENDRIVE IS 455 RS");
                          System.out.println("3. SNAPDEAL - PENDRIVE IS 555 RS");
                          System.out.println("CHOOSE YOUR FAVOURITE COMPANY ACCORDING TO YOUR BUDGET PRICE OF PENDRIVE");
                          selectCompany=input.nextInt();
                          switch(selectCompany)
                          {
                          case 1:System.out.println("YOU CHOSE AMAZON FOR PENDRIVE");
                          {
                              int num;
                              System.out.println("YOU CHOSE PENDRIVE OF RS 355 FROM AMAZON . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[0]++;
                                totalCost+=355;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 2:System.out.println("YOU CHOSE FLIPKART FOR PENDRIVE");
                          {
                              int num;
                              System.out.println("YOU CHOSE PENDRIVE OF RS 455 FROM FLIPKART . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[1]++;
                                totalCost+=455;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 3:System.out.println("YOU CHOSE SNAPDEAL FOR PENDRIVE");
                          {
                              int num;
                              System.out.println("YOU CHOSE PENDRIVE OF RS 555 FROM SNAPDEAL . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[2]++;
                                totalCost+=555;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          default:
                          {
                              System.out.println("invalid selection");
                              break;
                          }
                          }
                          break;
                      }
                      
                      //**********************MOUSE***********************
                      case 2:System.out.println("YOU CHOSE MOUSE");
                      {
                          int selectCompany;     
                          System.out.println("1. AMAZON  - MOUSE IS 655 RS");
                          System.out.println("2. FLIPKART - MOUSE IS 755 RS");
                          System.out.println("3. SNAPDEAL - MOUSE IS 855 RS");
                          System.out.println("CHOOSE YOUR FAVOURITE COMPANY ACCORDING TO YOUR BUDGET PRICE OF MOUSE");
                          selectCompany=input.nextInt();
                          switch(selectCompany)
                          {
                          case 1:System.out.println("YOU CHOSE AMAZON FOR MOUSE");
                          {
                              int num;
                              System.out.println("YOU CHOSE MOUSE OF RS 655 FROM AMAZON . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[3]++;
                                totalCost+=655;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 2:System.out.println("YOU CHOSE FLIPKART FOR MOUSE");
                          {
                              int num;
                              System.out.println("YOU CHOSE MOUSE OF RS 755 FROM FLIPKART . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[4]++;
                                totalCost+=755;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 3:System.out.println("YOU CHOSE SNAPDEAL FOR MOUSE");
                          {
                              int num;
                              System.out.println("YOU CHOSE MOUSE OF RS 855 FROM SNAPDEAL . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[5]++;
                                totalCost+=855;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          default:
                          {
                              System.out.println("invalid selection");
                              break;
                          }
                          }
                          break;
                      }

                      //*****************KEYBOARD*************************
                      case 3:System.out.println("YOU CHOSE KEYBOARD");
                      {
                          int selectCompany;     
                          System.out.println("1. AMAZON  - KEYBOARD IS 155 RS");
                          System.out.println("2. FLIPKART - KEYBOARD IS 255 RS");
                          System.out.println("3. SNAPDEAL - KEYBOARD IS 325 RS");
                          System.out.println("CHOOSE YOUR FAVOURITE COMPANY ACCORDING TO YOUR BUDGET PRICE OF KEYBOARD");
                          selectCompany=input.nextInt();
                          switch(selectCompany)
                          {
                          case 1:System.out.println("YOU CHOSE AMAZON FOR KEYBOARD");
                          {
                              int num;
                              System.out.println("YOU CHOSE KEYBOARD OF RS 155 FROM AMAZON . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[6]++;
                                totalCost+=155;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 2:System.out.println("YOU CHOSE FLIPKART FOR KEYBOARD");
                          {
                              int num;
                              System.out.println("YOU CHOSE KEYBOARD OF RS 255 FROM FLIPKART . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[7]++;
                                totalCost+=255;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 3:System.out.println("YOU CHOSE SNAPDEAL FOR KEYBOARD");
                          {
                              int num;
                              System.out.println("YOU CHOSE KEYBOARD OF RS 325 FROM SNAPDEAL . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[8]++;
                                totalCost+=325;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          default:
                          {
                              System.out.println("invalid selection");
                              break;
                          }
                          }
                          break;
                      }
                      default:
                      {
                          System.out.println("invalid selection");
                          break;
                      }
                      
                      }
                      break;
                    }
                    
                    
                    //***************************[[SHOES]]*********************************
                    
                    

                    case 2:
                        System.out.println("WE HAVE A GREAT VARIETIES OF SHOES BRANDS");
                    {
                      int accessoriesChoice;
                      System.out.println("1. NIKE");
                      System.out.println("2. ADDIDAS");
                      System.out.println("3. PUMA");
                      System.out.println("SELECT YOUR SHOE BRAND");
                      accessoriesChoice=input.nextInt();
                      cost[9]=1000; 
                      cost[10]=2000;
                      cost[11]=3000;// 3 cost for NIKE
                      cost[12]=4000;
                      cost[13]=5000;
                      cost[14]=6000;//3 cost for ADDIDAS
                      cost[15]=7000;
                      cost[16]=8000;
                      cost[17]=9000;//3 cost for PUMA
                      switch(accessoriesChoice)
                      {
                      
                      // *************NIKE******************
                      case 1:System.out.println("YOU CHOSE NIKE");
                      {
                          int selectCompany;     
                          System.out.println("1. AMAZON  - NIKE IS 1000 RS");
                          System.out.println("2. FLIPKART - NIKE IS 2000 RS");
                          System.out.println("3. SNAPDEAL - NIKE IS 3000 RS");
                          System.out.println("CHOOSE YOUR FAVOURITE COMPANY ACCORDING TO YOUR BUDGET PRICE OF NIKE");
                          selectCompany=input.nextInt();
                          switch(selectCompany)
                          {
                          case 1:System.out.println("YOU CHOSE AMAZON FOR NIKE");
                          {
                              int num;
                              System.out.println("YOU CHOSE NIKE OF RS 1000 FROM AMAZON . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[9]++;
                                totalCost+=1000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 2:System.out.println("YOU CHOSE FLIPKART FOR NIKE");
                          {
                              int num;
                              System.out.println("YOU CHOSE NIKE OF RS 2000 FROM FLIPKART . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[10]++;
                                totalCost+=2000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 3:System.out.println("YOU CHOSE SNAPDEAL FOR NIKE");
                          {
                              int num;
                              System.out.println("YOU CHOSE NIKE OF RS 3000 FROM SNAPDEAL . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[11]++;
                                totalCost+=3000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          default:
                          {
                              System.out.println("invalid selection");
                              break;
                          }
                          }
                          break;
                      }
                      
                      //**********************ADDIDAS***********************
                      case 2:System.out.println("YOU CHOSE ADDIDAS");
                      {
                          int selectCompany;     
                          System.out.println("1. AMAZON  - ADDIDAS IS 4000 RS");
                          System.out.println("2. FLIPKART - ADDIDAS IS 5000 RS");
                          System.out.println("3. SNAPDEAL - ADDIDAS IS 6000 RS");
                          System.out.println("CHOOSE YOUR FAVOURITE COMPANY ACCORDING TO YOUR BUDGET PRICE OF ADDIDAS");
                          selectCompany=input.nextInt();
                          switch(selectCompany)
                          {
                          case 1:System.out.println("YOU CHOSE AMAZON FOR ADDIDAS");
                          {
                              int num;
                              System.out.println("YOU CHOSE ADDIDAS OF RS 4000 FROM AMAZON . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[12]++;
                                totalCost+=4000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 2:System.out.println("YOU CHOSE FLIPKART FOR ADDIDAS");
                          {
                              int num;
                              System.out.println("YOU CHOSE ADDIDAS OF RS 5000 FROM FLIPKART . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[13]++;
                                totalCost+=5000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 3:System.out.println("YOU CHOSE SNAPDEAL FOR ADDIDAS");
                          {
                              int num;
                              System.out.println("YOU CHOSE ADDIDAS OF RS 6000 FROM SNAPDEAL . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[14]++;
                                totalCost+=6000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          default:
                          {
                              System.out.println("invalid selection");
                              break;
                          }
                          }
                          break;
                      }

                      //*****************PUMA*************************
                      case 3:System.out.println("YOU CHOSE PUMA");
                      {
                          int selectCompany;     
                          System.out.println("1. AMAZON  - PUMA IS 7000 RS");
                          System.out.println("2. FLIPKART - PUMA IS 8000 RS");
                          System.out.println("3. SNAPDEAL - PUMA IS 9000 RS");
                          System.out.println("CHOOSE YOUR FAVOURITE COMPANY ACCORDING TO YOUR BUDGET PRICE OF PUMA");
                          selectCompany=input.nextInt();
                          switch(selectCompany)
                          {
                          case 1:System.out.println("YOU CHOSE AMAZON FOR PUMA");
                          {
                              int num;
                              System.out.println("YOU CHOSE PUMA OF RS 7000 FROM AMAZON . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[15]++;
                                totalCost+=7000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 2:System.out.println("YOU CHOSE FLIPKART FOR PUMA");
                          {
                              int num;
                              System.out.println("YOU CHOSE PUMA OF RS 8000 FROM FLIPKART . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[16]++;
                                totalCost+=8000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 3:System.out.println("YOU CHOSE SNAPDEAL FOR PUMA");
                          {
                              int num;
                              System.out.println("YOU CHOSE PUMA OF RS 9000 FROM SNAPDEAL . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[17]++;
                                totalCost+=9000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          default:
                          {
                              System.out.println("invalid selection");
                              break;
                          }
                          }
                          break;
                      }
                      default:
                      {
                          System.out.println("invalid selection");
                          break;
                      }
                      }
                      break;
                    }
                    
                    
                    
                    
//***************************[[MOBILES]]*********************************
                    
                    

                    case 3:
                        System.out.println("WE HAVE A GREAT COLLECTION OF MOBILE BRANDS");
                    {
                      int accessoriesChoice;
                      System.out.println("1. APPLE");
                      System.out.println("2. SAMSUNG");
                      System.out.println("3. MI");
                      System.out.println("SELECT YOUR MOBILE BRAND");
                      accessoriesChoice=input.nextInt();
                      cost[18]=11000; 
                      cost[19]=12000;
                      cost[20]=13000;// 3 cost for APPLE
                      cost[21]=14000;
                      cost[22]=15000;
                      cost[23]=16000;//3 cost for SAMSUNG
                      cost[24]=17000;
                      cost[25]=18000;
                      cost[26]=19000;//3 cost for MI
                      switch(accessoriesChoice)
                      {
                      
                      // *************APPLE******************
                      case 1:System.out.println("YOU CHOSE APPLE");
                      {
                          int selectCompany;     
                          System.out.println("1. AMAZON  - APPLE IS 11000 RS");
                          System.out.println("2. FLIPKART - APPLE IS 12000 RS");
                          System.out.println("3. SNAPDEAL - APPLE IS 13000 RS");
                          System.out.println("CHOOSE YOUR FAVOURITE COMPANY ACCORDING TO YOUR BUDGET PRICE OF APPLE");
                          selectCompany=input.nextInt();
                          switch(selectCompany)
                          {
                          case 1:System.out.println("YOU CHOSE AMAZON FOR APPLE");
                          {
                              int num;
                              System.out.println("YOU CHOSE APPLE OF RS 11000 FROM AMAZON . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[18]++;
                                totalCost+=11000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 2:System.out.println("YOU CHOSE FLIPKART FOR APPLE");
                          {
                              int num;
                              System.out.println("YOU CHOSE APPLE OF RS 12000 FROM FLIPKART . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[19]++;
                                totalCost+=12000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 3:System.out.println("YOU CHOSE SNAPDEAL FOR APPLE");
                          {
                              int num;
                              System.out.println("YOU CHOSE APPLE OF RS 13000 FROM SNAPDEAL . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[20]++;
                                totalCost+=13000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          default:
                          {
                              System.out.println("invalid selection");
                              break;
                          }
                          }
                          break;
                      }
                      
                      //**********************SAMSUNG***********************
                      case 2:System.out.println("YOU CHOSE SAMSUNG");
                      {
                          int selectCompany;     
                          System.out.println("1. AMAZON  - SAMSUNG IS 14000 RS");
                          System.out.println("2. FLIPKART - SAMSUNG IS 15000 RS");
                          System.out.println("3. SNAPDEAL - SAMSUNG IS 16000 RS");
                          System.out.println("CHOOSE YOUR FAVOURITE COMPANY ACCORDING TO YOUR BUDGET PRICE OF SAMSUNG");
                          selectCompany=input.nextInt();
                          switch(selectCompany)
                          {
                          case 1:System.out.println("YOU CHOSE AMAZON FOR SAMSUNG");
                          {
                              int num;
                              System.out.println("YOU CHOSE SAMSUNG OF RS 14000 FROM AMAZON . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[21]++;
                                totalCost+=14000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 2:System.out.println("YOU CHOSE FLIPKART FOR SAMSUNG");
                          {
                              int num;
                              System.out.println("YOU CHOSE SAMSUNG OF RS 15000 FROM FLIPKART . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[22]++;
                                totalCost+=15000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 3:System.out.println("YOU CHOSE SNAPDEAL FOR SAMSUNG");
                          {
                              int num;
                              System.out.println("YOU CHOSE SAMSUNG OF RS 16000 FROM SNAPDEAL . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[23]++;
                                totalCost+=16000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          default:
                          {
                              System.out.println("invalid selection");
                              break;
                          }
                          }
                          break;
                      }

                      //*****************MI*************************
                      case 3:System.out.println("YOU CHOSE MI");
                      {
                          int selectCompany;     
                          System.out.println("1. AMAZON  - MI IS 17000 RS");
                          System.out.println("2. FLIPKART - MI IS 18000 RS");
                          System.out.println("3. SNAPDEAL - MI IS 19000 RS");
                          System.out.println("CHOOSE YOUR FAVOURITE COMPANY ACCORDING TO YOUR BUDGET PRICE OF MI");
                          selectCompany=input.nextInt();
                          switch(selectCompany)
                          {
                          case 1:System.out.println("YOU CHOSE AMAZON FOR MI");
                          {
                              int num;
                              System.out.println("YOU CHOSE MI OF RS 17000 FROM AMAZON . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[24]++;
                                totalCost+=17000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 2:System.out.println("YOU CHOSE FLIPKART FOR MI");
                          {
                              int num;
                              System.out.println("YOU CHOSE MI OF RS 18000 FROM FLIPKART . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[25]++;
                                totalCost+=18000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          
                          case 3:System.out.println("YOU CHOSE SNAPDEAL FOR MI");
                          {
                              int num;
                              System.out.println("YOU CHOSE MI OF RS 19000 FROM SNAPDEAL . IF YES PRESS 1 ELSE ENTER ANY KEY TO EXIT");
                              num=input.nextInt();
                              if(num==1)
                              {
                                a[26]++;
                                totalCost+=19000;
                              }
                              System.out.println("YOUR COST IN CART IS:"+totalCost);
                              break;
                          }
                          default:
                          {
                              System.out.println("invalid selection");
                              break;
                          }
                          }
                          break;
                      }
                      default:
                      {
                          System.out.println("invalid selection");
                          break;
                      }
                      
                      }
                   
                      break;
                    } 
                    
                    default:
                    {
                        System.out.println("invalid selection");
                        break;
                    }
                    
                    //END OF ALL PRODUCTS
                    
                    //ADDITIONAL FEATURES OF MY PROGRAM
                    
                    
                  }
                  System.out.println(s+"'s CART OF");
                  System.out.println("ID \t QUANTITY \t COST ");
                  for(i=0;i<27;i++)
                  {
                      if(a[i]!=0)
                      {
                          System.out.println(""+i+"\t\t"+a[i]+"     \t"+(cost[i]*a[i])+" RS");
                      }
                  }
                  
                  System.out.println("TOTAL COST: \t"+totalCost+" RS");
                  
                  System.out.println("IF YOU WISH TO BY ANYTHING ELSE");
                  System.out.println("1. ADD AND CHANGE QUANTITY");
                  System.out.println("2. DELETE QUANTITY");
                  System.out.println("3. EXIT BY PRESSING ANY KEY");
                  c=input.nextInt();
              
                   if(c==2)
                   {
                       int id;
                         System.out.println("ID  PRODUCT  ");
                     for(i=0;i<27;i++)
                     {
                         if( i<3)
                         {
                      System.out.println(""+i+"  PENDRIVE ");
                         }
                         if(i>2 && i<6)
                         {
                      System.out.println(""+i+"   MOUSE ");       
                         }
                         if(i>5 && i<9)
                         {
                      System.out.println(""+i+"   KEYBOARD ");       
                         }
                         if( i>8 && i<12)
                         {
                      System.out.println(""+i+"   NIKE ");
                         }
                         if(i>11 && i<15)
                         {
                      System.out.println(""+i+"   ADDIDAS ");       
                         }
                         if(i>14 && i<18)
                         {
                      System.out.println(""+i+"   PUMA ");       
                         }
                         if( i>17 && i<21)
                         {
                      System.out.println(""+i+"   APPLE ");
                         }
                         if(i>20 && i<24)
                         {
                      System.out.println(""+i+"   SAMSUNG");       
                         }
                         if(i>23 && i<27)
                         {
                      System.out.println(""+i+"     MI ");       
                         }
                         
                         
                     }
                       
                       
                       
                       
                       System.out.println("ENTER ID FROM ABOVE TABLE TO DELETE ITEM");
                       id=input.nextInt();
                       if(id<27 && id>0)
                       {
                           totalCost=totalCost-(cost[id]*a[id]);
                           a[id]=0;
                       }
                       else
                       {
                           System.out.println("INVALID ID");
                       }
                       System.out.println("REVISED ITEMS");
                       System.out.println("ID \t  QUANTITY \t COST");
                       for(i=0;i<27;i++)
                       {
                           if(a[i]!=0)
                           {
                               System.out.println(""+i+"\t\t"+a[i]+"    \t"+(cost[i]*a[i])+" RS");
                           }
                       }
                       
                       System.out.println("TOTAL COST: \t"+totalCost+" RS");
                       
                      System.out.println("IF YOU WISH TO BY ANYTHING ELSE");
                     System.out.println("1. ADD AND CHANGE QUANTITY");
                     System.out.println("2. DELETE QUANTITY");
                     System.out.println("3. EXIT BY PRESSING ANY KEY");
                     c=input.nextInt();
                     
                     
                   }
                        if(c==1)
                        {
                            int id,quantity;
                        System.out.println("ID  PRODUCT");
                             for(i=0;i<27;i++)
                             {
                                 if( i<3)
                                 {
                              System.out.println(""+i+"  PENDRIVE ");
                              
                                 }
                                 if(i>2 && i<6)
                                 {
                              System.out.println(""+i+"   MOUSE ");       
                                 }
                                 if(i>5 && i<9)
                                 {
                              System.out.println(""+i+"   KEYBOARD ");       
                                 }
                                 if( i>8 && i<12)
                                 {
                              System.out.println(""+i+"   NIKE ");
                                 }
                                 if(i>11 && i<15)
                                 {
                              System.out.println(""+i+"   ADDIDAS ");       
                                 }
                                 if(i>14 && i<18)
                                 {
                              System.out.println(""+i+"   PUMA ");       
                                 }
                                 if( i>17 && i<21)
                                 {
                              System.out.println(""+i+"   APPLE ");
                                 }
                                 if(i>20 && i<24)
                                 {
                              System.out.println(""+i+"   SAMSUNG");       
                                 }
                                 if(i>23 && i<27)
                                 {
                              System.out.println(""+i+"     MI ");       
                                 }
                                 
                                 
                             }
                            
                            
                            
                            System.out.println("ENTER ID FROM ABOVE TABLE TO CHANGE QUANTITY");
                            id=input.nextInt();
                             System.out.println("ENTER QUANTITY TO BE CHANGED OR ADD");
                             quantity=input.nextInt();
                             
                             if(id<27)
                             {
                                 if(quantity>0 && a[id]>0)
                                 {
                                     if(quantity<a[id])
                                     {
                                         int dec=a[id]-quantity;
                                         a[id]=quantity;
                                         totalCost=totalCost-(cost[id]*dec);
                                     }
                                     if(quantity>a[id])
                                     {
                                         int inc=quantity-a[id];
                                         a[id]=quantity;
                                         totalCost=totalCost+(cost[id]*inc);
                                     }
                                     if(quantity==a[id])
                                     {
                                         a[id]=quantity;
                                         totalCost=totalCost+0;
                                     }
                                 }
                                 else
                                 {
                                     System.out.println("ITEM HAS NO QUANTITY");
                                 }
                             }
                             else
                             {
                                 System.out.println("ENTER VALID ID"); 
                             }
                             
                             System.out.println("REVISED ITEMS");
                             System.out.println("ID \t  QUANTITY \t COST");
                             for(i=0;i<27;i++)
                             {
                                 if(a[i]!=0)
                                 {
                                     System.out.println(""+i+"\t\t"+a[i]+"   \t"+(cost[i]*a[i])+" RS");
                                 }
                             }
                            System.out.println("TOTAL COST: \t"+totalCost+" RS");
                             
                             System.out.println("IF YOU WISH TO BY ANYTHING ELSE");
                            System.out.println("1. ADD AND CHANGE QUANTITY");
                            System.out.println("2. DELETE QUANTITY");
                            System.out.println("3. EXIT BY PRESSING ANY KEY");
                            c=input.nextInt();
                         
                        }
                             
                           
                  
              }while(choice!=0);
             System.out.println("YOUR TOTAL COST IS:"+totalCost);
             System.out.println("THANKS "+s+" FOR CHOOSING US HOPE SO WE HAVE SAVED YOUR TIME IN SHOPPING AND WE EXPECT YOU TO COME BACK AGAIN");
          }

        }



























