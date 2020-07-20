<!DOCTYPE html>
<#import "/spring.ftl" as spring/>
<html>
<head>
     <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
     rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
     crossorigin="anonymous">
     <link rel="stylesheet" type="text/css"
      href="<@spring.url '/css/style.css'/>"/>
     <link rel="stylesheet" href="css/style.css">

        </head>
        <ul class="nav nav-pills nav-fill">
          <li class="nav-item">
          <a class="nav-link active" href="#">AFC Task Planer</a>
          </li>

          <li class="nav-item">
          <a class="nav-link" href="#">Active IT-DevOps Tasks</a>
          </li>

          <li class="nav-item">
          <a class="nav-link" href="#">Tasks in Process</a>
          </li>

          <li class="nav-item">
          <a class="nav-link" href="#">Tasks On Hold</a>
          </li>

          <li class="nav-item">
          <a class="nav-link" href="#">Done</a>
          </li>

          <li class="nav-item">
          <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled Tasks </a>
          </li>

          <form class="form-inline">
          <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>
        </nav>
		 </ul>

	<div class="d-flex" id="wrapper">
    <!-- Sidebar -->
    <div class="bg-light border-right" id="sidebar-wrapper">
      <div class="sidebar-heading">AFC Tasks </div>
      <div class="list-group list-group-flush">
        <a href="#" class="list-group-item list-group-item-action bg-light">Dashboard</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">Boards</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">New Planner</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">Overview</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">My Tasks</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">Status</a>
      </div>
    </div>

	   <div class="container-fluid">
       <h3>Task Planner</h3>
       <a href="taskList">To Do</a>
       <br><br>
          <div>
             <table border="1">
                <tr>
                   <th>Task Name</th>
                   <th>Task Id</th>
                </tr>
                <#list tasks as task>
                <tr>
                   <td>${task.taskName}</td>
                   <td>${task.taskId}</td>
                </tr>
                </#list>
             </table>
          </div>
              <div>
              <fieldset>
              <legend>Add Task</legend>
               <form name="tasks" action="" method="POST">
                Task Name: <@spring.formInput "taskForm.taskName" "" "text"/> <br/>
                Task Id: <@spring.formInput "taskForm.taskId" "" "text"/> <br/>
                <input type="submit" value="Add" />
              </form>
              </fieldset>

           </div>
     </body>
     </head>
  </html>
