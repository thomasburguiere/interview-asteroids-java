# Java Assesment: Asteroids

## Assignment

Create a rest endpoint that returns list of Near Earth Objects from the nasa NEO Feed API, for a specific date range

### Additionnal tasks

add possibility to only retrieve dangerous Near Earth Objects

## NEO Feed API


#### Query parameters:

|Parameter   |Type        |Default                  |Description                         |
|------------|------------|-------------------------|------------------------------------|
|`start_date`|`YYYY-MM-DD`|none                     |Starting date for asteroid search   |
|`end_date`  |`YYYY-MM-DD`|7 days after `start_date`| Ending date for asteroid search    |
|`api_key`   |`string`    |`DEMO_KEY`               | api.nasa.gov key for expanded usage|


#### Example call:

https://api.nasa.gov/neo/rest/v1/feed?start_date=2015-09-07&end_date=2015-09-08&api_key=DEMO_KEY

