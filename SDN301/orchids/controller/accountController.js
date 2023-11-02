const Orchids = require('../model/orchid')

let categoryData = [
    {id: "1", name: "Dendrobium"},
    {id: "2", name: "Phalaenopsis"},
    {id: "3", name: "Cattleya"},
]
class orchidController{
    index(req, res, next){
        const baseUrl = req.originalUrl
        Orchids.find({})
        .then((orchids)=>{
            res.render('orchids',
            {
                title: 'List of Orchids',
                orchidData: orchids,
                categoryData,
                baseUrl
            }
            )
        }).catch(next)
    }
    create(req, res, next){
        	const orchid = new Orchids(req.body);
	        orchid.save()
	        .then(() => res.redirect('/orchids'))
	        .catch(error =>{});

    }
    formData(req, res, next){
        const orchidId = req.params.orchidId
        Orchids.findById(orchidId).then((orchid)=> {
            res.render('orchidForm', {
                title: 'Update Orchid',
                categoryData,
                orchid
            })
        })
    }
    update(req, res, next){
        const orchidId = req.params.orchidId
        Orchids.findByIdAndUpdate(orchidId, req.body)
        .then((orchid)=>{
            res.redirect('/orchids')
        }).catch(next)
    }
    delete(req, res, next){
        const orchidId = req.params.orchidId
        Orchids.findByIdAndDelete(orchidId)
        .then((orchid)=>{
            res.redirect('/orchids')
        })
    }
}
module.exports = new orchidController