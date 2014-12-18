// get application's base URL
var baseURL = document.location.origin + document.location.pathname;

// toastr notifier https://github.com/CodeSeven/toastr
toastr.options.positionClass = 'toast-top-right';
toastr.options.closeButton = true;
toastr.options.extendedTimeOut = 1000;
toastr.options.timeOut = 5000;


// web sockets: for notifications
var socket = io.connect('//localhost:3000');

socket.on('welcome' , function(data){
    $('#messages').append('<li>' + data.message + '</li>');
    socket.emit('i am client', {data: 'foo!'});
});

socket.on('time', function(data){
    console.log(data);
    $('#messages').append('<li>' + data.time + '</li>');
});

socket.on('error', function(){ connect.error(arguments)});
socket.on('message', function(){ connect.log(arguments)});