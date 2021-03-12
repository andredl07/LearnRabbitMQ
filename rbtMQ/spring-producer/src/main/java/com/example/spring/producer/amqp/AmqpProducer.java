package com.example.spring.producer.amqp;

public interface AmqpProducer<T> {
    //interface para desacoplar de qualquer broker

    void producer(T t);

}
