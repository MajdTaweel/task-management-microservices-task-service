package com.asaltech.taskmanagement.taskservice.service.mapper;


import com.asaltech.taskmanagement.taskservice.domain.Task;
import com.asaltech.taskmanagement.taskservice.service.dto.TaskDTO;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {


    default Task fromId(String id) {
        if (id == null) {
            return null;
        }
        Task task = new Task();
        task.setId(id);
        return task;
    }
}
