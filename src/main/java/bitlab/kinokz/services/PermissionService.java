package bitlab.kinokz.services;


import bitlab.kinokz.dto.PermissionDTO;
import bitlab.kinokz.impl.PermissionRepoImpl;
import bitlab.kinokz.mapper.PermissionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PermissionService {

	private final PermissionRepoImpl repo;

	private final PermissionMapper mapper;


	public List<PermissionDTO> getAllPermissions(){
		return mapper.toDtoList(repo.getAllPermissions());
	}
}
