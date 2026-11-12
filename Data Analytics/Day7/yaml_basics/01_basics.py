'''
What is yaml?
A human-readable data serialization standard that can be used in conjunction with all programming languages and is often used to write configuration files. It is commonly used for configuration files and in applications where data is being stored or transmitted.

pip install pyyaml
'''

import yaml

with open("first_config.yaml", "r") as file:
    config = yaml.safe_load(file)
    
print(config)
print("_"*60)
print(config['my_app_name'])
print("_"*60)
print(config["debug_mode"])
print("_"*60)
print(config["database"])
print("_"*60)
db_config = config["database"]
print(db_config["port"])
print("_"*60)
print(config["features"])
print("_"*60)