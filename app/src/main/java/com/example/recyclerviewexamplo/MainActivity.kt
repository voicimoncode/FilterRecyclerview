class SimpleVolley(val context: Context) {

    fun getData(url: String, callback: (JSONObject?) -> Unit) {
        val queue = Volley.newRequestQueue(context)
        val request = JsonObjectRequest(Request.Method.GET, url, null,
            { response -> callback(response) },
            { error -> callback(null) }
        )
        queue.add(request)
    }
}

