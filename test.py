import re

texto = "<stdio.h>"
coincidencias = re.search(r"<([^>]*)>", texto)
if coincidencias:
    print(coincidencias.group(1)) 