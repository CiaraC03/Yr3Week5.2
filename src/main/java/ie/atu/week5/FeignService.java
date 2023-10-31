package ie.atu.week5;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeignService {

    private static TodoClient todoClient;

    public FeignService(TodoClient todoClient)
    {
        this.todoClient = todoClient;
    }

    public static TodoResponse fetchData()
    {
        List<TodoResponse> td = todoClient.fetchData(); //creates a list from TodoResponse to variable td and calls the fetch data method from object todoClient
        System.out.println(td); //prints the list from variable td
        TodoResponse todoResponse = new TodoResponse(); //created an instance of class TodoResponse
        for (TodoResponse todo : td) //created a loop to run through all to do objects
        {
            if(todo.getId() == 196) //Extract the to do with an id of 96
            {
                System.out.println(todo.toString());//return the to do

            }
        }
        return todoResponse; //returning the to do

    }
}
