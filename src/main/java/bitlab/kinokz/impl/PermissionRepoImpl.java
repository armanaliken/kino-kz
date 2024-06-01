package bitlab.kinokz.impl;

import bitlab.kinokz.model.Permission;
import bitlab.kinokz.repo_services.PermissionRepoInterface;
import bitlab.kinokz.repository.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PermissionRepoImpl implements PermissionRepoInterface {

	private final PermissionRepository repository;

	@Override
	public Permission getPermissionById(Long id) {
		return repository.findAllById(id);
	}

	@Override
	public Permission addPermission(Permission permission) {
		return repository.save(permission);
	}

	@Override
	public List<Permission> getAllPermissions() {
		return repository.findAll();
	}

}
