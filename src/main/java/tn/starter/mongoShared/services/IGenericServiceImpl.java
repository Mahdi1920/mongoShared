package tn.starter.mongoShared.services;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Slf4j
public class IGenericServiceImpl<DTO,T,ID> implements IGenericService<DTO,T,ID> {


	@Override
	public DTO add(DTO dto) {
		return null;
	}

	@Override
	public DTO update(DTO dto) {
		return null;
	}

	@Override
	public DTO retrieveById(ID id) {
		return null;
	}

	@Override
	public List<DTO> retrieveAll() {
		return List.of();
	}

	@Override
	public void delete(ID id) {

	}
}
