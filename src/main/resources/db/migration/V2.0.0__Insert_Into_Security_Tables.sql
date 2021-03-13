INSERT INTO role (id, role)
VALUES (1, 'ADMIN'),
       (2, 'DEVELOPER');

INSERT INTO user_detail (id, username, password, active, is_expired, is_locked, is_not_expired, role_id)
VALUES (1, 'umesh_admin', 'password', true, false, false, true, 1),
       (2, 'umesh_dev', 'password', true, false, false, true, 2);

INSERT INTO client_detail (id, client_id, resource_ids, is_secret_required, client_secret, is_scoped, scope,
                           is_auto_approve, authorized_grant_types, registered_redirect_uri, authorities,
                           access_token_validity_seconds, refresh_token_validity_seconds, additional_information)
VALUES (1, 'client_id', '', true, 'client_secret', true, 'all', true,
        'authorization_code, password, client_credentials', '', 'ADMIN', 3600, 3600, NULL);