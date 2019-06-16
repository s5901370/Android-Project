import sys
sys.path.append("..")
from django.shortcuts import render
from django.core import serializers
from django.http import HttpResponse
from django.http import JsonResponse
import json
from scratch import theater
from scratch import Ambassador
from scratch import Nantai
from scratch import Cmmovies


def mall(request):
    j = theater.Mall()
    send = json.dumps(j, ensure_ascii=False)
    # posts_serialized = serializers.serialize('json', send)
    # print(send)
    print(send)
    return JsonResponse(send, safe=False, json_dumps_params={'ensure_ascii':False})

def fe(request):
    j = theater.FE()
    send = json.dumps(j, ensure_ascii=False)
    # posts_serialized = serializers.serialize('json', send)
    # print(send)
    print(send)
    return JsonResponse(send, safe=False, json_dumps_params={'ensure_ascii':False})

def am(request):
    j = Ambassador.ambassador()
    send = json.dumps(j, ensure_ascii=False)
    # posts_serialized = serializers.serialize('json', send)
    # print(send)
    print(send)
    return JsonResponse(send, safe=False, json_dumps_params={'ensure_ascii':False})

def nantai(request):
    j = Nantai.nantai()
    send = json.dumps(j, ensure_ascii=False)
    # posts_serialized = serializers.serialize('json', send)
    # print(send)
    print(send)
    return JsonResponse(send, safe=False, json_dumps_params={'ensure_ascii':False})

def cm_today(request):
    today, beauty = Cmmovies.cm()
    send = json.dumps(today, ensure_ascii=False)
    # posts_serialized = serializers.serialize('json', send)
    # print(send)
    print(send)
    return JsonResponse(send, safe=False, json_dumps_params={'ensure_ascii':False})

def cm_beauty(request):
    today, beauty = Cmmovies.cm()
    send = json.dumps(beauty, ensure_ascii=False)
    # posts_serialized = serializers.serialize('json', send)
    # print(send)
    print(send)
    return JsonResponse(send, safe=False, json_dumps_params={'ensure_ascii':False})


