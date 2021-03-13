CREATE TABLE role
(
    id   INT PRIMARY KEY,
    role VARCHAR(128) NOT NULL
);


CREATE TABLE user_detail
(
    id             INT PRIMARY KEY,
    username       VARCHAR(128),
    password       VARCHAR(128),
    active         BOOL,
    is_expired     BOOL,
    is_locked      BOOL,
    is_not_expired BOOL,
    role_id        INT NOT NULL,
    FOREIGN KEY (role_id) REFERENCES role (id)
);

CREATE TABLE client_detail
(
    id                             INT PRIMARY KEY,
    client_id                      VARCHAR(255),
    resource_ids                   VARCHAR(255),
    is_secret_required             BOOL,
    client_secret                  VARCHAR(255),
    is_scoped                      bool,
    scope                          VARCHAR(255),
    is_auto_approve                bool,
    authorized_grant_types         VARCHAR(255),
    registered_redirect_uri        VARCHAR(255),
    authorities                    VARCHAR(255),
    access_token_validity_seconds  INT,
    refresh_token_validity_seconds INT,
    additional_information         VARCHAR(255)
);