# SpringBoot-Micrometer
Spring Boot - Monitoring Microservice with Prometheus and Grafana, we used docker here to up Prometheus and Grafana Server 

## Run Docker Desktop 
### hit command for Prometheus and Grafana
-- $ docker pull prom/prometheus
-- $ docker image ls

# Run the Prometheus docker container in the background
-- $ docker run -d --name prometheus -p 9090:9090 -v <PATH_TO_prometheus.yml_FILE>:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml

### Visualizing Spring Boot Metrics from Prometheus dashboard
That’s it! You can now navigate to http://localhost:9090 explore the Prometheus dashboard. Here I have selected go_memstats_gc_cpu_fraction metric for demo purpose. You can define any metric here

# Setup Grafana in Docker
Now, we are going to integrate Prometheus metrics to Grafana dashboard. To do that, first, pull the Grafana docker image.

-- $ docker run -d --name grafana -p 3000:3000 grafana/grafana
# Integrate Grafana with Prometheus metrics

You can now navigate to http://localhost:3000 and log in to Grafana with the default username admin and password admin.

# Prometheus is an open-source software application used for event monitoring and alerting. It records real-time metrics in a time series database with flexible queries and real-time alerting. A simple user interface where you can visualize, query, and monitor all the metrics.
Grafana is an open-source platform for data visualization, monitoring, and analysis. In Grafana, users can create dashboards with panels, each representing specific metrics over a set time-frame. Grafana supports graph, table, heatmap, and free text panels as well as integration with official and community-built plugins and apps that could be visualized too.

# Why Prometheus and Grafana?
Prometheus dashboard also has simple graphs. But Grafana’s graphs are way better it can be customized according to the user requirements. That’s why, in this post, we’ll integrate Grafana with Prometheus to import and visualize our metrics data.
