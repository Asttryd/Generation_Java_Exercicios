����   = [  beeCrowd/Exercicio1002  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LbeeCrowd/Exercicio1002; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  java/text/DecimalFormat  0.0000
     ! (Ljava/lang/String;)V
  # $ % 
nextDouble ()D@	!���n@       
 + - , java/lang/Math . / pow (DD)D	  1 2 3 out Ljava/io/PrintStream;
  5 6 7 format (D)Ljava/lang/String;   9 : ; makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String;
 = ? > java/io/PrintStream @ ! println args [Ljava/lang/String; leia Ljava/util/Scanner; deci Ljava/text/DecimalFormat; area D raio 
SourceFile Exercicio1002.java BootstrapMethods
 N P O $java/lang/invoke/StringConcatFactory : Q �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; M T A= InnerClasses W %java/lang/invoke/MethodHandles$Lookup Y java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	       �     9� Y� � L� Y� M+� "9 & (� *kJ� 0,)� 4� 8  � <�    
       	  
     (  8     4    9 A B    . C D   $ E F  (  G H    I H   J    K L     R  S U   
  V X Z 