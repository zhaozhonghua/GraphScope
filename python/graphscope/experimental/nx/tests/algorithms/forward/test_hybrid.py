import networkx.algorithms.tests.test_hybrid
import pytest

from graphscope.experimental.nx.utils.compat import import_as_graphscope_nx

import_as_graphscope_nx(networkx.algorithms.tests.test_hybrid,
                        decorators=pytest.mark.usefixtures("graphscope_session"))