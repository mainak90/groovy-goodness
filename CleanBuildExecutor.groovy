for (aSlave in hudson.model.Hudson.instance.slaves) {
    if (aSlave.getComputer().isOffline()) {
        aSlave.getComputer().setTemporarilyOffline(true,null);
        aSlave.getComputer().doDoDelete();
    }
}