package examples.two

import static Two.*

def marked = pipe {
    from input \
    map parity
}

def even = pipe {
    from marked \
    filter only(EVEN) \
    count() \
    map with(EVEN)
}

def odd = pipe {
    from marked \
    filter only(ODD) \
    count() \
    map with(ODD)
}

def result = pipe {
    from concat(even, odd) doOnNext show("total")
}

drain result


