package com.asaltech.taskmanagement.taskservice.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TaskMapperTest {

    private TaskMapper taskMapper;

    @BeforeEach
    public void setUp() {
        taskMapper = new TaskMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        String id = "id1";
        assertThat(taskMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(taskMapper.fromId(null)).isNull();
    }
}
