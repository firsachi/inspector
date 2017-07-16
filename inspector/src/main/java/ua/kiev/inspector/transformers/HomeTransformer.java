package ua.kiev.inspector.transformers;

import org.springframework.stereotype.Component;

import ua.kiev.inspector.model.HomeModel;
import ua.kiev.inspector.repository.entity.RinspDoc;

@Component("homeTransformer")
public class HomeTransformer implements BaseTransformer<RinspDoc, HomeModel>{

	@Override
	public HomeModel entityToModel(RinspDoc entity) {
		HomeModel model = new HomeModel();
		model.setId(entity.getId());
		model.setStreet(entity.getStreet());
		model.setDistrict(entity.getDistrict().getName());
		model.setUsrNotes(entity.getOpis());
		model.setCreatedDate(entity.getDateDoc());
		model.setAdmNotes(entity.getAnswer());
		model.setState(entity.getStatys().getName());
		return model;
	}

	@Override
	public RinspDoc modelToEntity(HomeModel model) {
		// TODO Auto-generated method stub
		return null;
	}

}
