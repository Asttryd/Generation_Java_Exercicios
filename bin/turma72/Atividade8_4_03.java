����   = ]  turma72/Atividade8_4_03  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lturma72/Atividade8_4_03; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  java/text/DecimalFormat  0.00
     ! (Ljava/lang/String;)V	  # $ % out Ljava/io/PrintStream; ' /
Por favor, digite seu salário bruto (float): 
 ) + * java/io/PrintStream , ! println
  . / 0 	nextFloat ()F 2 2
Por favor, digite seu adicional noturno (float):  4 .
Por favor, digite suas horas extras (float):  6 +
Por favor, digite seus descontos (float): @�  
  9 : ; format (D)Ljava/lang/String;   = > ? makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String; args [Ljava/lang/String; leia Ljava/util/Scanner; deci Ljava/text/DecimalFormat; salarioBruto F adicionalNoturno horasExtras 	descontos salarioLiquido 
SourceFile Atividade8_4_03.java BootstrapMethods
 P R Q $java/lang/invoke/StringConcatFactory > S �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; O V 
O seu salário líquido é:  InnerClasses Y %java/lang/invoke/MethodHandles$Lookup [ java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	           n� Y� � L� Y� M� "&� (+� -F� "1� (+� -8� "3� (+� -8� "5� (+� -8%b7jbf8� ",�� 8� <  � (�    
   6           "  *  0  8  >  F  L   [ " m %    R    n @ A    c B C   Y D E  " L F G  0 > H G  > 0 I G  L " J G  [  K G   L    M N     T  U W   
  X Z \ 