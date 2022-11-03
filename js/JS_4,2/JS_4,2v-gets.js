import express from 'express';
import { request } from 'http';

const app = express();

app.get('/teste', (request, response) => {
    response.send('GET vander!')
});

app.listen(3000, () => {console.log('CARREGANDO PÁGINA')});
