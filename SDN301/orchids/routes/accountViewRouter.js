var express = require('express');
const orchidController = require('../controller/orchidController')
var orchidRouter = express.Router();
orchidRouter.route('/')
.get(orchidController.index)
.post(orchidController.create)

orchidRouter.route('/edit/:orchidId')
    .get(orchidController.formData)
    .put(orchidController.update)

orchidRouter.route('/delete/:orchidId')
    .get(orchidController.delete)

module.exports = orchidRouter;
