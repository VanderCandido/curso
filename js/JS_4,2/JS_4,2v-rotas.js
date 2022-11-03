var express = require('express');
var rota = express.Router();
 
rota.get('/users', function(us) {
    res.send(`USUÁRIOS`);
});
 
rota.post('/user', function(us) {
    res.send(`CRIAR USUÁRIO`);
});
 
module.exports = rota;
