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
## development logs(1.14)
 I noticed that there is one warn showing in the <b><font color="red">product</font></b> service console saying (~~~Skipping MapperFactoryBean with name 'attrAttrgroupRelationDao' and 'com.atguigu.gulimall.product.dao.AttrAttrgroupRelationDao' mapperInterface. Bean already defined with the same name!~~~)
 At least now it didn't influence my development, I will ignore it temporarily.

