package bitlab.kinokz.repo_services;

import bitlab.kinokz.model.Permission;

import java.util.List;


public interface PermissionRepoInterface {
	Permission getPermissionById(Long id);

	Permission addPermission(Permission permission);

	List<Permission> getAllPermissions();
}
