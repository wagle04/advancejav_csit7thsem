<html>
   <head>
      <title>Information of user</title>
   </head>
   
   <body>
      <h1>Information of user</h1>
      <ul>
         <li><p><b>First Name:</b>
            <%= request.getParameter("first_name")%>
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getParameter("last_name")%>
         </p></li>
         <li><p><b>Age:</b>
            <%= request.getParameter("age")%>
         </p></li>
         <li><p><b>Address:</b>
            <%= request.getParameter("address")%>
         </p></li>
         <li><p><b>Phone Number:</b>
            <%= request.getParameter("phone_no")%>
         </p></li>
      </ul>
   
   </body>
</html>