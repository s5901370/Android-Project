# 引入 requests 模組
import requests
import json


# r = requests.get('http://127.0.0.1:8000/T.S.Mall/')
# t = json.loads(r.text)
# print(t)

# r = requests.get('http://127.0.0.1:8000/FE21/')
# t = json.loads(r.text)
# print(t)

# r = requests.get('http://127.0.0.1:8000/Ambassador/')
# t = json.loads(r.text)
# print(t)

# r = requests.get('http://127.0.0.1:8000/Nantai/')
# t = json.loads(r.text)
# print(t)

# r = requests.get('http://127.0.0.1:8000/Cmmovies_today/')
# t = json.loads(r.text)
# print(t)

r = requests.get('http://127.0.0.1:8000/Cmmovies_beauty/')
t = json.loads(r.text)
print(t)