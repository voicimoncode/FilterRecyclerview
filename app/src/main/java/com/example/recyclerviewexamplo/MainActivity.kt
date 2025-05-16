lifecycleScope.launch {
    val data = withContext(Dispatchers.IO) {
        getDataFromNetwork()
    }
    updateUI(data)
}
