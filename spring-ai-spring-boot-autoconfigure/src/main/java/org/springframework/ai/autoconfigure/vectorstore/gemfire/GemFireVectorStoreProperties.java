/*
 * Copyright 2023-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ai.autoconfigure.vectorstore.gemfire;

import org.springframework.ai.autoconfigure.CommonVectorStoreProperties;
import org.springframework.ai.vectorstore.GemFireVectorStoreConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Geet Rawat
 */
@ConfigurationProperties(GemFireVectorStoreProperties.CONFIG_PREFIX)
public class GemFireVectorStoreProperties extends CommonVectorStoreProperties {

	/**
	 * Configuration prefix for Spring AI VectorStore GemFire.
	 */
	public static final String CONFIG_PREFIX = "spring.ai.vectorstore.gemfire";

	/**
	 * The host of the GemFire to connect to. To specify a custom host, use
	 * "spring.ai.vectorstore.gemfire.host";
	 *
	 */
	private String host = GemFireVectorStoreConfig.DEFAULT_HOST;

	/**
	 * The port of the GemFire to connect to. To specify a custom port, use
	 * "spring.ai.vectorstore.gemfire.port";
	 */
	private int port = GemFireVectorStoreConfig.DEFAULT_PORT;

	/**
	 * The name of the index in the GemFire. To specify a custom index, use
	 * "spring.ai.vectorstore.gemfire.index-name";
	 */
	private String indexName = GemFireVectorStoreConfig.DEFAULT_INDEX_NAME;

	/**
	 * The beam width for similarity queries. Default value is {@code 100}. To specify a
	 * custom beam width, use "spring.ai.vectorstore.gemfire.beam-width";
	 */
	private int beamWidth = GemFireVectorStoreConfig.DEFAULT_BEAM_WIDTH;

	/**
	 * The maximum number of connections allowed. Default value is {@code 16}. To specify
	 * custom number of connections, use "spring.ai.vectorstore.gemfire.max-connections";
	 */
	private int maxConnections = GemFireVectorStoreConfig.DEFAULT_MAX_CONNECTIONS;

	/**
	 * The similarity function to be used for vector comparisons. Default value is
	 * {@code "COSINE"}. To specify custom vectorSimilarityFunction, use
	 * "spring.ai.vectorstore.gemfire.vector-similarity-function";
	 *
	 */
	private String vectorSimilarityFunction = GemFireVectorStoreConfig.DEFAULT_SIMILARITY_FUNCTION;

	/**
	 * The fields to be used for queries. Default value is an array containing
	 * {@code "vector"}. To specify custom fields, use
	 * "spring.ai.vectorstore.gemfire.fields"
	 */
	private String[] fields = GemFireVectorStoreConfig.DEFAULT_FIELDS;

	/**
	 * The number of buckets to use for partitioning the data. Default value is {@code 0}.
	 *
	 * To specify custom buckets, use "spring.ai.vectorstore.gemfire.buckets";
	 *
	 */
	private int buckets = GemFireVectorStoreConfig.DEFAULT_BUCKETS;

	/**
	 * Set to true if GemFire cluster is ssl enabled
	 *
	 * To specify sslEnabled, use "spring.ai.vectorstore.gemfire.ssl-enabled";
	 */
	private boolean sslEnabled = GemFireVectorStoreConfig.DEFAULT_SSL_ENABLED;

	public int getBeamWidth() {
		return beamWidth;
	}

	public void setBeamWidth(int beamWidth) {
		this.beamWidth = beamWidth;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public int getMaxConnections() {
		return maxConnections;
	}

	public void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}

	public String getVectorSimilarityFunction() {
		return vectorSimilarityFunction;
	}

	public void setVectorSimilarityFunction(String vectorSimilarityFunction) {
		this.vectorSimilarityFunction = vectorSimilarityFunction;
	}

	public String[] getFields() {
		return fields;
	}

	public void setFields(String[] fields) {
		this.fields = fields;
	}

	public int getBuckets() {
		return buckets;
	}

	public void setBuckets(int buckets) {
		this.buckets = buckets;
	}

	public boolean isSslEnabled() {
		return sslEnabled;
	}

	public void setSslEnabled(boolean sslEnabled) {
		this.sslEnabled = sslEnabled;
	}

}
