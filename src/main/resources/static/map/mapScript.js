//api documentation examples
/*let map;

async function initMap(google) {
  const { Map } = await google.maps.importLibrary("maps");

  map = new Map(document.getElementById("map_div"), {
    center: { lat: -34.397, lng: 150.644 },
    zoom: 8,
  });
}

initMap();*/

// youtuber example
/*(function(window, google){

FOR mapScript !! -> <script src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>

//map options
let options = {
center: {
lat : 38.6270,
lng : -90.1994 },
zoom: 10
}
element = document.getElementById('map_div');
//map
map = new google.map.Maps(element, options)

}(window, google))*/

//the og static map
  /*
      USE IN mapScript.js !!! ->  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
      google.charts.load("current", {
          "packages":["map"],
          "mapsApiKey": "AIzaSyDgfwP9_Iur5vGE5suxMVNq3qwiONfMq2I"
        });
         google.charts.setOnLoadCallback(drawChart);
      function drawChart() {

      let data = google.visualization.arrayToDataTable([
                     ['Lat', 'Long', 'Name'],
                     [38.6270,  -90.1994, 'St. Louis'],
                     [38.65214508187943, -90.2595139, 'LaunchCode'],
                   ]);

      if(navigator.geolocation){
           navigator.geolocation.getCurrentPosition(function (position){
           initialLocation = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);
           alert("You are at: " + initialLocation);
           })
           }

             let map = new google.visualization.Map(document.getElementById('map_div'));
             map.draw(data, {
               showTooltip: true,
               showInfoWindow: true
             });

           }*/