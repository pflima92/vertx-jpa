package io.vertx.ext.jpa;

import io.vertx.codegen.annotations.VertxGen;

@VertxGen
public interface Query {
	
	Query setMaxResults(int maxResult);

}