package com.graial.piazza

import dev.hotwire.turbo.nav.TurboNavGraphDestination

@TurboNavGraphDestination(uri = "turbo://fragment/web/tab")
class TabbedWebFragment : WebFragment() {}