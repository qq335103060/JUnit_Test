<%@ page language="java" import="java.util.*,java.awt.image.*,java.awt.*,javax.imageio.*" pageEncoding="GBK" contentType="image/jpeg"%> 
 <!-- �ǵ�contentType="image/jpeg" --> 
 <% response.setHeader("cache-control","no-cache");  %>
 <%! 
 Color getRandColor(int start,int end,long seed) 
 { 
     if(start>255) 
     { 
         start=255; 
     } 
     Random random=new Random(seed); 
     int r=start+random.nextInt(end+1-start); 
     int g=start+random.nextInt(end+1-start); 
     int b=start+random.nextInt(end+1-start); 
     return new Color(r,g,b); 
 } 
  %> 
 <% 
 int width=60; 
 int height=20; 
 //�����������֤���е���ĸ,�������ö�һ�� 
String[] str={"1","a","A","B","c","2","I","8","U","y","3","T","V","6","7","v","N","n","9"}; 
 BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB); 
 //���������ֽ�ˣ���Ҫ֪����ȸ߶� 
Graphics g=image.getGraphics(); 
 //������б��� 
  
  
  
g.setColor(getRandColor(230,250,System.currentTimeMillis())); 
 //�����ѱ�պ����ɫ�� 
g.fillRect(0,0,width,height); 
 //����ɫ 
Random random=new Random(System.currentTimeMillis()); 
 //�������� 
g.setColor(getRandColor(160,200,System.currentTimeMillis())); 
 for(int i=0;i<50;i++) 
 { 
     g.drawLine(random.nextInt(6),random.nextInt(15), 
     random.nextInt(6)+random.nextInt(56),random.nextInt(7)+random.nextInt(17)); 
 } 
  
  
 String check=new String(); 
  
 g.setFont(new Font("Times new Roman",Font.PLAIN,18)); 
 for(int i=0;i<4;i++) 
 { 
     g.setColor(getRandColor(20,110,System.currentTimeMillis()+i*1000)); 
     //String ran=String.valueOf(random.nextInt(10)); 
     int temp=random.nextInt(10); 
     String ran=str[temp]; 
     check+=ran; 
     g.drawString(ran,6+i*13,16);//�ֱ�����д���� 
 } 
 //����ͨ��session����ȡ�����������֤�� 
session.setAttribute("check",check); 
  
 g.dispose(); 
 //ʹͼ����Ч 
 //response.setCharacterEncoding("GBK"); 
 //request.setCharacterEncoding("GBK"); 
 ImageIO.write(image,"JPEG",response.getOutputStream()); 
 //��ͼ����������������ֱ�Ϊֽ����ʽ����������Ӧ������� 
  
out.clear(); 
 out=pageContext.pushBody(); 
 //���������䣬tomcat��û���쳣��Ϣ 
  
  
 %> 