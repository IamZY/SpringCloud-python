from django.http import HttpResponse

def hello(request):
    return HttpResponse("hello world")

def sidecar(request):
    return HttpResponse("{\"status\":\"UP\"}",content_type="application/json")