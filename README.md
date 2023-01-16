# gulimall

<html>
<body>
Gulimall is a distributed e-commerce project. SpringBoot 2.1.8.RELEASE was mainly used in the backend and vue was used in the frontend. This project will be developed in three phases. Now the first phase has been finished.

<h2>Technology Stack</h2>

<b>Java</b>

<b>Spring</b>

<b>SpringMvc</b>

<b>Springboot</b>

<b>Mybatis Plus</b>

<b>Mysql</b>

<b>Vue</b>

<b>Node.js</b>

<b>Springcloud ： nacos , openfeign ， gateway, etc.</b>


<h2>Module Introduction</h2>

<table>
  <tr>
    <th>Module Name</th>
    <th>Module Description</th>
  </tr>
  <tr>
    <td>gulimall-common</td>
    <td>To save constant, exception, util classes, etc.</td>
  </tr>
  <tr>
    <td>gulimall-coupon</td>
    <td>To provide product coupon information</td>
  </tr>
  <tr>
    <td>gulimall-gateway</td>
    <td>The gateway receives all requests from the front-end and forwards them to other services</td>
  </tr>
  <tr>
    <td>gulimall-member</td>
    <td>To provide member services</td>
  </tr>
  <tr>
    <td>gulimall-order</td>
    <td>To provide order services</td>
  </tr>
  <tr>
    <td>gulimall-product</td>
    <td>add/update/delete products</td>
  </tr>
  <tr>
    <td>gulimall-third-party</td>
    <td>Integrate third party services, such as Aliyun OSS</td>
  </tr>
  <tr>
    <td>gulimall-ware</td>
    <td>To provide ware services</td>
  </tr>
</table>
  
 <h2>Operation instruction</h2> 
1. First you need to build a suitable environment to develop the project:<br>
2. Import RENREN-FAST and RENREN-FAST-VUE from website https://gitee.com/renrenio and take mine(waiting for uploading) as reference.<br>
3. Use command "npm install" to firstly install the front-end and then use "npm dev run" to run this front-end system.<br>  
4. Build databases and import sql files(waiting for uploading...)<br>
5. Modify the specific information in each application.yml<br>
6. Install Nacos and use Nacos as registration and configuration center(you can also use other software)<br>
7. Start applications(currently exclude gulimall-order)<br>
Please take my configuration as an example:<br>
<table>
  <tr>
    <td>java</td>
    <td>version:"1.8.0_351"</td>
  </tr>
  <tr>
    <td>MAVEN</td>
    <td>Version:3.6.3</td></tr>
 <tr>
    <td>Node.js</td>
   <td>Version:12.0.0</td></tr><br>   
 <tr>
   <td>MySQL</td>
   <td>Version: 8.0.30</td><tr><br> 
  </table>     
</body>
</html>
<h3> development logs(1.14)
 I noticed that there is one warn showing in the <b><font color="red">product</font></b> service console saying 
 (~~~Skipping MapperFactoryBean with name 'attrAttrgroupRelationDao' and 'com.atguigu.gulimall.product.dao.AttrAttrgroupRelationDao' mapperInterface. Bean already defined with the same name!~~~)At least now it didn't influence my development, I will ignore it temporarily.<br>
  Finally found it was caused by the duplicated use of mapper scan on starter class and @Mapper annotation!!!<br>

 <h4>gulimall - ware 
   It is corresponding to gulimall_vms database. There are 6 tables in the database. One saves the information of different wares. One saves the stock details in each ware.Two of them are related with order. The left two are to do with purchase details. <br>
   Firstly, I can't add ware info data. It prompts 500 error. I checked the code of wareInfoController and didn't find anything wrong. I noticed the console showing that there might be a problem in SQL. I finally found that I didn't add get/set methods for wareInfo entity after deleting lombok(there is conflict if I use lombok).<br>
   
![image](https://user-images.githubusercontent.com/88880169/212474076-d199c60b-9272-4d06-b998-5b712f980531.png)
when I developed spu管理 and chose 规格，the page showed 400. After I inserted one SQL"INSERT INTO sys_menu (menu_id, parent_id, name, url, perms, type, icon, order_num) VALUES (76, 37, '规格维护', 'product/attrupdate', '', 2, 'log', 0);" and change type to 1. I can see the content of "规格".<br> ??<b>I still have questions here.</b><br>
<h3>Development log</h3>
Today I added one more module(gulimall-search) in gulimall. This module integrated elasticsearch. However, third-party module can't register in nacos suddenly after adding this new module. Actually I have met the this issue when I added third-party module and at that time product module can't be registered in Nacos. I didn't solve it but redid the whole project from the beginning since I couldn't find any solutions. This time I solved it by moving other modules to the same namespace as third-party. Although third-party can't register itself in the public, it can be registered in other namespace. 
