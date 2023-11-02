var express = require('express');
var router = express.Router();


router.get('/', function(req, res, next) {
    res.render('index', { title: 'Express' });
})

router.post('/success', function(req, res, next) {
        const body = req.body;
        res.render('success', {body: body});
    });

module.exports = router;
